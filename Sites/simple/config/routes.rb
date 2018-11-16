Rails.application.routes.draw do
  get 'welcome/mainpage'
  
  root 'welcome#mainpage'
 
  
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
