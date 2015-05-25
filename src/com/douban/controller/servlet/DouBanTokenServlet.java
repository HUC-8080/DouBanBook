package com.douban.controller.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dongxuexidu.douban4j.model.app.AccessToken;
import com.dongxuexidu.douban4j.model.app.DoubanException;
import com.dongxuexidu.douban4j.model.app.RequestGrantScope;
import com.dongxuexidu.douban4j.provider.OAuthDoubanProvider;
import com.douban.common.util.DouBanConfig;

/**
 * Servlet implementation class DouBanTokenServlet
 */
public class DouBanTokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DouBanTokenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
        String code = request.getParameter("code");
        OAuthDoubanProvider oauth = new OAuthDoubanProvider();
        oauth.setApiKey(DouBanConfig.API_KEY).setSecretKey(DouBanConfig.SECRET_KEY);
        oauth.addScope(RequestGrantScope.BASIC_COMMON_SCOPE).addScope(RequestGrantScope.SHUO_READ_SCOPE).addScope(RequestGrantScope.SHUO_WRITE_SCOPE)
                .addScope(RequestGrantScope.BASIC_NOTE_SCOPE).addScope(RequestGrantScope.BOOK_READ_SCOPE).addScope(RequestGrantScope.EVENT_READ_SCOPE).addScope(RequestGrantScope.EVENT_WRITE_SCOPE)
                .addScope(RequestGrantScope.MAIL_READ_SCOPE).addScope(RequestGrantScope.MAIL_WRITE_SCOPE).addScope(RequestGrantScope.MOVIE_READ_SCOPE).addScope(RequestGrantScope.MUSIC_READ_SCOPE);
        oauth.setRedirectUrl(DouBanConfig.ACCESS_TOKEN_REDIRECT_URL);
          String accessToken = ""; 
          String uid = "";
          AccessToken at = null;
			try {
				at = oauth.tradeAccessTokenWithCode(code);
		        System.out.println("at : " + at.getAccessToken());
		        System.out.println("uid : " + at.getDoubanUserId());
		        accessToken = at.getAccessToken();
		        uid = at.getDoubanUserId();
			} catch (DoubanException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        request.setAttribute("accessToken",accessToken);
	        request.setAttribute("uid",uid);
        	response.sendRedirect("http://localhost/DouBanBook/douban?token="+accessToken+"&uid="+uid+"&uname="+at.getDoubanUserName());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
