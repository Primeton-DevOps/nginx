# Simple Nginx Reverse Proxy  
  
    location / {
        proxy_pass http://${your.app.domain};
    }
  
  
    location / {
        proxy_pass http://${your.app.ip:port};
    }