class LeavesController < ApplicationController

  def index
    @leaves = Leave.all
  end

  def show
    @leave = Leave.find(params[:id])
  end
 

  def new
  end

  def create
    @leave = current_user.leaves.build.new(leave_params)
    if @leave.save
      flash[:success] = "Your leave has been recorded."
      redirect_to @leave
    else
      flash.now[:error] = "We found following errors."
      render 'new'
    end
  end

  def update
  @leave = Leave.find(params[:id])
 
  if @leave.update(leave_params)
    redirect_to @leave
  else
    render 'new'
  end
end
 
private
  def leave_params
    params.require(:leave).permit(:Request_for, :from, :to, :Reason)
  end
end
