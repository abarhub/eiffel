class TEST11

feature

	make is
	local
	i:INTEGER;
	do
	i:=i @ 5;
	i:=i # 3;
	i:=i | 7;
	i:=i & 6;
	i:=i @abc 75;
	i:=@ 5;
	i:=# 3;
	i:=| 7;
	i:=& 6;
	i:=@abc 75;
	end;

	pos:INTEGER;

feature {INTEGER} -- coucou

	coucou is
	-- salut a tous
	do
	end;


end