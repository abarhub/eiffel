deferred class COMPARABLE

inherit ANY
	redefine is_equal
	end;

feature

	infix "<" (other:like Current):BOOLEAN is
	require
		other/=Void;
	deferred
	end;

	infix "<=" (other:like Current):BOOLEAN is
	require
		other/=Void;
	do
	Result:=not (Current>other);
	end;

	infix ">=" (other:like Current):BOOLEAN is
	require
		other/=Void;
	do
	Result:=not (Current<other);
	end;

	infix ">" (other:like Current):BOOLEAN is
	require
		other/=Void;
	do
	Result:=other<Current;
	end;

	is_equal(other:like Current):BOOLEAN is
	require
		other/=Void;
	do
	Result:=not (Current<other) and not(Current>other);
	end;

	max(other:like Current):like Current is
	require
		other/=Void;
	do
	if other>=Current then
		Result:=other;
	else
		Result:=Current;
	end;
	end;

	min(other:like Current):like Current is
	require
		other/=Void;
	do
	if other<=Current then
		Result:=other;
	else
		Result:=Current;
	end;
	end;

	three_way_comparison(other:like Current):INTEGER is
	require
		other/=Void;
	do
	if Current>other then
		Result:=1;
	elseif Current<other then
		Result:=-1;
	else
		Result:=0;
	end;
	ensure
		1=0;
	end;

	

--feature

end
