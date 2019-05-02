$(document).ready(function(){
	var uploadButton = $('button.btn-upload');
	var fileInput = $('input#file');
	var importForm = $('.importform');

	uploadButton.on('click', function(e){
		fileInput.click();
	})

	fileInput.on('change', function(e){
		importForm.submit();
	})

	importForm.on('submit', function(e){
		e.preventDefault();
		var data = new FormData($(this)[0]);
		console.log({data});

		$.ajax({
			type: "POST",
			enctype: 'multipart/form-data',
			url: importForm.attr('action'),
			data: data,
			processData: false, //prevent jQuery from automatically transforming the data into a query string
			contentType: false,
			cache: false,
			timeout: 600000,
			success: function (data) {
				console.log(data);
			},
			error: function (e) {
				console.log("ERROR : ", e);
			}
		});
		
	})
})