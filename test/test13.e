class TEST13

creation make

feature

	make is
	local
	c:CHARACTER;
	s:STRING;
	i,j:INTEGER;
	t:ARRAY[INTEGER];
	do
	c:='a';
	s:="abc";
	i:=0;
	i:=i+2;
	i:=i*j-i+6-(10+78);
	t:=<<i,i+1,j/i+2*j>>;
	end;

end