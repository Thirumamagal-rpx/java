class Leave < ApplicationRecord
	belongs_to :user
	LEAVE_LIST = ["work from home","Maternity leave","Adoption leave", "other"]
end
