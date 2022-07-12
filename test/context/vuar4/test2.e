class TEST2

creation make

feature

	make is
	local
	i:INTEGER;
	p:POINTER;
	do
	tata(p,'a');
	p:=$(i);
	p:=$i;
	tata(p,'0');
	tata($i,'0');
	end;


	tata(a:POINTER;b:CHARACTER) is
	do
	end;
	
end