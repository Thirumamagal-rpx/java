Rails.application.routes.draw do
	
	 # resources :app_index

	get 'users/new', to: 'users#new'
	
	
	root 'users#new'

	post 'users/new' , to: 'users#home'

	resources :users

  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
