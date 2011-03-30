require 'ostruct'

def static(arg) ; :static ; end
def void(arg)   ; nil     ; end
def main(arg)   ; yield   ; end

args = Class.new { def [] ; end }.new

System = OpenStruct.new(out: STDOUT)

def STDOUT.println(str)
  puts str
end

public static void main(String args[]){
  System.out.println("Hello World");
}