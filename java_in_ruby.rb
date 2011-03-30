require 'ostruct'

def static(arg) ; :static ; end
def void(arg)   ; nil     ; end
def main(arg)   ; yield   ; end

args = Class.new { def [] ; end }.new

System = OpenStruct.new(out: STDOUT)

class IO
  def println(str)
    puts str
  end
end

public static void main(String args[]){
  System.out.println("Hello World");
}