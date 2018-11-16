class CreateLeaves < ActiveRecord::Migration[5.1]
  def change
    create_table :leaves do |t|
      t.string :Request_for
      t.string :from
      t.string :to
      t.string :Reason

      t.timestamps
    end
  end
end



