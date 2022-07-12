indexing coucou: "1d2sf31",azerty,"123";
	toto: "dsfqsf";
	fd12f: dfsq;
-- une classe de teste
class COUCOU

-- hello a tous

creation toto,tata
creation tyty

creation {INTEGER} coucou,salut
creation {ANY,NONE,TOUS} a,b,c,d

feature 

	a is 
	obsolete "fonction disparue"
	require
	do 
	
	ensure
	a:a+b;
	end

	a is 
	require
	a;b;c;
	a:;--hgjhgj
	b:;--kbnvbn
	do 
	from i:=0;j:=0;
	until i>j
	invariant a and b; c or d;;
	variant 50-i
	loop
	end;
	check
		a>=b;c<=5;
	end;
	debug
		a:=5;b:=7;
	end;
	debug("coucou")
		a(7,k);b:=a;
	end;
	debug("a","b")
		a(78123,d(azed));
	end;
	ensure
	a:a+b;;;;a and b or true;
	end

	a is -- coucou
	-- a
	-- tous
	do

	end;

	a is -- coucou
	-- a
	-- tous
	obsolete -- obs1
	"aaa" -- obs2
	do

	end;

	a is -- coucou
	-- a
	-- tous
	require -- rien
	4>5;
	do

	end;

invariant
	a:45/78>fd;
	a<b;;;;c and then q;

end