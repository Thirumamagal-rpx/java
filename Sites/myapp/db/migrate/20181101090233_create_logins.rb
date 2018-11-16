class CreateLogins < ActiveRecord::Migration[5.1]
  def change
    create_table :logins do |t|
      t.string :e_mail
      t.string :password

      t.timestamps
    end
  end
end
