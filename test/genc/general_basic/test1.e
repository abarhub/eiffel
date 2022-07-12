class TEST1

creation make

feature

	make is
	local
	a,a2:A;
	b:BOOLEAN;
	s:STRING;
	a3:ANY;
	do
	a:=Void;
	!!a2;
	b:=a=a2;
	a:=a2;
	b:=a=a2;
	a:=a2.twin;
	b:=a=a2;
	!!a3;
	b:=a.conforms_to(a2);
	b:=a.conforms_to(b);
	b:=a.conforms_to(a3);
	b:=a3.conforms_to(a);
	b:=a.conforms_to(a);
	s:=a.generating_type;
	s:=a.generator;
	end;

end