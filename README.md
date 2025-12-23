Steps to Run
1. Verify the docker and kafka producer application are running.
2. Run the application from the main class.
3. Send the POST request via below curl

curl --request POST \
  --url http://localhost:8080/send \
  --header 'content-type: application/json' \
  --data '{
  "message": "Hello, How are you? Manu"
}'
