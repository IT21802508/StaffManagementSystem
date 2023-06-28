<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@2.0.7/css/boxicons.min.css">
<link rel="stylesheet" href="indexstyle.css">



<style>

.search-bar {
        display: flex;
        align-items: center;
        justify-content: center;
        margin-top: 350px;
        margin-left: 10px;
        
        padding: 8px 100px;
    }

    .search-bar input {
        width: 300px;
        height: 40px;
        padding: 8px 100px;
        font-size: 16px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    .search-bar button {
        margin-left: 10px;
        padding: 7px 3.5px;
        font-size: 13.8px;
        border: none;
        border-radius: 4px;
        background-color: #007bff;
        color: #fff;
        cursor: pointer;
    }
    body {
	
	overflow-x: hidden;
	background-image: url('data:image/jpeg;base64,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');

}


</style>

<script>

function performSearch() {
    // Get the search input value
    const searchInput = document.getElementById('searchInput').value;
    // Perform search operations here...
    alert('Performing search for Staff ID: ' + searchInput);
}


const allSideMenu = document.querySelectorAll('#sidebar .side-menu.top li a');

allSideMenu.forEach(item=> {
	const li = item.parentElement;

	item.addEventListener('click', function () {
		allSideMenu.forEach(i=> {
			i.parentElement.classList.remove('active');
		})
		li.classList.add('active');
	})
});




// TOGGLE SIDEBAR
const menuBar = document.querySelector('#content nav .bx.bx-menu');
const sidebar = document.getElementById('sidebar');

menuBar.addEventListener('click', function () {
	sidebar.classList.toggle('hide');
})







const searchButton = document.querySelector('#content nav form .form-input button');
const searchButtonIcon = document.querySelector('#content nav form .form-input button .bx');
const searchForm = document.querySelector('#content nav form');

searchButton.addEventListener('click', function (e) {
	if(window.innerWidth < 576) {
		e.preventDefault();
		searchForm.classList.toggle('show');
		if(searchForm.classList.contains('show')) {
			searchButtonIcon.classList.replace('bx-search', 'bx-x');
		} else {
			searchButtonIcon.classList.replace('bx-x', 'bx-search');
		}
	}
})





if(window.innerWidth < 768) {
	sidebar.classList.add('hide');
} else if(window.innerWidth > 576) {
	searchButtonIcon.classList.replace('bx-x', 'bx-search');
	searchForm.classList.remove('show');
}


window.addEventListener('resize', function () {
	if(this.innerWidth > 576) {
		searchButtonIcon.classList.replace('bx-x', 'bx-search');
		searchForm.classList.remove('show');
	}
})



const switchMode = document.getElementById('switch-mode');

switchMode.addEventListener('change', function () {
	if(this.checked) {
		document.body.classList.add('dark');
	} else {
		document.body.classList.remove('dark');
	}
})



</script>

<style>

@charset "ISO-8859-1";



@import url('https://fonts.googleapis.com/css2?family=Lato:wght@400;700&family=Poppins:wght@400;500;600;700&display=swap');








</style>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
</head>
<body>


<!-- SIDEBAR -->
	<section id="sidebar">
		<a href="#" class="brand">
			<i class='bx bxs-graduation'></i>
			<span class="text"><h1>BrightMind</h1></span>
		</a>
		<ul class="side-menu top">
			
			<li>
				<a href="userInsert.jsp">
					<i class='bx bxs-group' ></i>
					<span class="text">Manage Staff</span>
				</a>
			</li>
			<li>
				<a href="userAccount.jsp">
					<i class='bx bxs-credit-card' ></i>
					<span class="text">Staff Salary</span>
				</a>
			</li>
			<li>
				<a href="userAccount.jsp">
					<i class='bx bxs-calendar-check' ></i>
					<span class="text">Shift Schedule</span>
				</a>
			</li>
			<li>
				<a href="userAccount.jsp">
					<i class='bx bxs-message-square-add' ></i>
					<span class="text">Manage Leaves</span>
				</a>
			</li>
		</ul>
		<ul class="side-menu">
			<li>
				<a href="#">
					<i class='bx bxs-cog' ></i>
					<span class="text">Settings</span>
				</a>
			</li>
			<li>
				<a href="#" class="logout">
					<i class='bx bxs-log-out-circle' ></i>
					<span class="text">Logout</span>
				</a>
			</li>
		</ul>
	</section>
	<!-- SIDEBAR -->



	<!-- CONTENT -->
	
	<section id="content">
	<form action="search" method="post">

	
        <div class="search-bar">
            <input type="text" id="searchInput" placeholder="Search..." name="stfid">
            <button onclick="performSearch()">Search</button>
        </div>
        </form>
    </section>
	
	
	<!-- CONTENT -->
	

	<script src="script.js"></script>

</body>
</html>