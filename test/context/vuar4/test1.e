class TEST1

creation make

feature

	make is
	local
	i:INTEGER;
	p:POINTER;
	do
	tata(i,'a');
	p:=$(i+2);
	p:=$(i);
	p:=$i;
	i:=p;
	tata(p,'0');
	tata($i,'0');
	tata(2,$i);
	end;


	tata(a:INTEGER;b:CHARACTER) is
	do
	end;
	
end