deferred class SALUT


obsolete "coucou, %
	%c'est fini"

inherit TOTO;
	TATA
		rename a as b
		export {TOTO_,TATA_} a0,b0;
		undefine c,d
		redefine ta,ton
		select zy,va
		end;
	TYTY
		end;
	TUTU
		rename t0 as t, t1 as t2
		export {TETE} all;
		end;
	TATA
		rename a as b;
		export {TOTO_,TATA_} a0,b0;
		undefine c,d;
		redefine ta,ton;
		select zy,va;
		end;


feature

	a:FIXED_ARRAY[INTEGER] is <<a,b>>;

	b is
	obsolete "toto"
	require
		a=5;
	once
		t:=78;
	ensure
		b=6;
	rescue
		p:=96;
	end;

feature {A,B}

	i:INTEGER;
	j:BOOLEAN;

end