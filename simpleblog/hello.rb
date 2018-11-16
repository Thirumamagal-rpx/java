# hello.rb  
#!/usr/bin/ruby -w   
  
 puts("add operator")   
 puts(10 + 20)      
 puts("subtract operator")   
 puts(35 - 15)    
 puts("multiply operator")   
 puts(4 * 8)   
 puts("division operator")   
 puts(25 / 5)   
 puts("exponential operator")   
 puts(5 ** 2)   
 puts("modulo operator")   
 puts(25 % 4)

 
 
 class States   
   @@no_of_states=0   
   def initialize(name)   
      @states_name=name   
      @@no_of_states += 1   
   end   
  
    def total_no_of_states()   
       puts "Total number of states written: #@@no_of_states"   
    end   
end   
  
# Create Objects   
first=States.new("Assam")   
second=States.new("Meghalaya")   
third=States.new("Maharashtra")   
fourth=States.new("Pondicherry")   
  
# Call Methods   
first.total_no_of_states()   
second.total_no_of_states()   
third.total_no_of_states()   
fourth.total_no_of_states()  


a = gets.chomp.to_i   
if a >= 18   
  puts "You are eligible to vote."   
end  