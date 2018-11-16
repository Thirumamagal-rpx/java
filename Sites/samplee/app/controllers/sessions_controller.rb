class SessionsController < ApplicationController
  # def new
  # end

  # def create
  #    user = User.authenticate(params[:email], params[:password])
  #   if user
  #     session[:user_id]=user.user_id
  #     redirect_to new_session_url, :notice=>"Logged in"
  #   else 
  #     flash.now.alert="Invalid email or password"
  #   end
  # end


def index
    @users = User.all
  end

   def create
    if user = User.authenticate(params[:username], params[:password])
      # Save the user ID in the session so it can be used in
      # subsequent requests
      session[:current_user_id] = user.id
      redirect_to users_url, :notice=> "Logged in"
    else
      flash.now.alert="Invalid email and password"
    end
  end

 
end
