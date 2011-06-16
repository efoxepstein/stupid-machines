# Cyclic Tag System starting with 11001 with rules 010, 000, 1111
a,b='11001',%w[010 000 1111];(p a)>'09'&&a=a[1..-1]+b[i%3] while a[0]