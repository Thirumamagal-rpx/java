require 'BCrypt'
class User < ApplicationRecord
	 has_secure_password
	 attr_accessor :password
	 attr_accessor:password_digest
	 # before_save :encrypt_password

	 validates_confirmation_of :password
	 validates_presence_of :password, :on => :create
	 validates_uniqueness_of :email
	 validates_presence_of :email


	 def self.authenticate(email,password)
	 	byebug
	 	user = find_by_email(email)
	 	 if user && user.password_hash == BCrypt::Engine.hash_secret(password, user.password_salt)
    user
  else
    nil
  end
	 end

	 def encrypt_password
	 	if password.present?
	 		self.password_salt = BCrypt::Engine.generate_salt
	 		self.password = BCrypt::Engine.hash_secret(password, user.password_salt)
	 	end
	 end
	 


end