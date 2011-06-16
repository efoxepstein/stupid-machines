# Cyclic Tag System starting with 11001 with rules 010, 000, 1111
a='11001';%w[010 000 1111].cycle{|x|a=a[1..-1]+((p a)>'09'?x:'');1/a.size}