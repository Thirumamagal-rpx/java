
require_relative "board"
require_relative "player"
require "pry"

class Connect
 attr_reader :p1 , :p2, :current_player, :opponent
 
 def initialize
    @board = Board.new
    @p1 = nil
    @p2 = nil
  end
 
def Matrix
row,col,default_value=6,7,0
arr_2d =Array.new(row){
Array.new(col,default_value)}
end


def get_player_names
    print "Enter name for first player: "
    p1_name = gets.chomp
    puts
    p2_name = names_unique?(p1_name)
    initialize_players(p1_name, p2_name)
  end

  def names_unique?(p1_name)
    print "Enter name for second player: "
    p2_name = gets.chomp
    puts
    while p1_name.downcase == p2_name.downcase
      print "Second player, please enter a different name than the first player: "
      p2_name = gets.chomp
      puts
    end
    p2_name
  end

end

game = Connect.new
game.play