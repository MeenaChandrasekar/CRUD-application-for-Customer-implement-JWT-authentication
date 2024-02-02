// Function to authenticate user
function authenticateUser() {
    const loginId = document.getElementById("login_id").value;
    const password = document.getElementById("password").value;

    // Authentication API endpoint
    const authEndpoint = "https://qa.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp";

    // Authentication request body
    const authRequestBody = {
        "login_id": loginId,
        "password": password
    };

    // Make a POST request to authenticate user
    fetch(authEndpoint, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(authRequestBody)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error("Authentication failed");
        }
        return response.json();
    })
    .then(data => {
        // On successful authentication, store the received token securely
        const token = data.token;

        // Save the token in localStorage
        localStorage.setItem('authToken', token);

        // Hide the login screen and show the customer list screen
        document.getElementById("login-screen").style.display = "none";
        document.getElementById("customer-list-screen").style.display = "block";

        // Now, you can use this token for subsequent API calls
        // (Include it in the Authorization header as 'Bearer <token>')
        syncCustomers();
    })
    .catch(error => {
        console.error("Authentication error:", error);
        // Handle authentication error (e.g., show an error message)
    });
}
