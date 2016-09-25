<?php

	if(isset($_POST['btn'])){
	$tipe = $_FILES['file']['type'];
	$nama = $_FILES['file']['name'];
	$size = $_FILES['file']['size'];

	if(move_uploaded_file($_FILES['file']['tmp_name'], $nama)) {
	    echo 'Berhasil mengupload '.$nama;
	} else{
	    echo "Eror";
	}
	}

	?>

	<form enctype="multipart/form-data" action="" method="POST">
	Pilih File : <input name="file" type="file" /><br />
	<input type="submit" value="Upload File" name="btn" />
	</form>