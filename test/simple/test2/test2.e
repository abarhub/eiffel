indexing coucou: "1d2sf31",azerty,"123";
	toto: "dsfqsf";
	fd12f: dfsq;
-- une classe de teste
class COUCOU

-- hello a tous

feature 

	a is do end
	b is 5;
	c(a,b:INTEGER) is do i:=5+2;end
	d(ze,rty:INTEGER;kj:BOOLEAN) is deferred end
	e:STRING is "coucou a tous"+"salut% a tous"+"un %"text%" fin"
	f:CHARACTER is 'a'
	g is 45/86 and 78 implies 7512 or else 452 <78

	h is
	local i,j:k; f:i;;ty,hg,ds,rg:mlo;
	do
	p?=45+21;
	l:=75+12;
	if 75=12 then fg(45,213);f;kljjlk("sdfgdf");else f(45) end;
	check 123;true implies false;
	end;
	s:="abc"+"coucou%
		% a tous %
		%et a vous aussi";
	from i:=0;
	until i>45
	loop
		i:=i+1;
	end;
	debug("a","b")
		i:=a/=b;
		j:=7*8;
	end;
	!!a;
	!!b.make;
	!ARRAY!c;
	!ARRAY!d.make;
	!ARRAY!e.make(0);
	inspect i
	when 4 then
		i:=i+1;
	else
		j:=j+2;
	end;
	inspect i
	when 4,5 then
		i:=i+1;
	when 4..5,6,7..8 then
		i:=i+1;
	else
		j:=j+2;
	end;
	inspect i
	when 4,5 then
		i:=i+1;
	when 4..5,6,7..8 then
		i:=i+1;
	end;
	if true then a;else a end;
	if true then a end;
	if true then a; elseif false then a else a end;
	end;


end