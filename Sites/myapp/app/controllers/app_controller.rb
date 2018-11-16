class AppController < ApplicationController
	def new
	end
	def create
		
	  render plain: params[:app].inspect
	end
end
