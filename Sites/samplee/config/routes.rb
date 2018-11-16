Rails.application.routes.draw do
  get 'sessions/new'

 post 'sessions/new', to: 'users#index'

  resources :users
  resources :sessions
 
 root 'users#index'
 

  # resources :ideas

  #  get '/users' => 'users#new'
  # post '/users'=> 'users#create'
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
