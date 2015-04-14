
function charts(d ,nd,c){
var done=d;
var notDone=nd;

if(c='Donut'){
new Morris.Donut({
	element:'donutChart',
	data:[
	     {label: 'Completed', value:done},
	     {label: 'UnderProcessing', value:notDone},
	     ],
xkey:'label',
ykey:['value'],
labels:['label']
});
}
else
	{
	new Morris.Line({
		element:'donutChart',
		data:[
		     {label: 'Completed', value:done},
		     {label: 'UnderProcessing', value:notDone},
		     ],
	xkey:'label',
	ykey:['value'],
	labels:['label']
	});
	}	
	
return true;
};
