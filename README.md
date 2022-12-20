1. First, you need to have Docker running on your computer.

2. Next, make sure there are no other containers currently running on ports 5432 and 3010.

3. Finally, just execute the following command in a terminal (from this directory):

    `docker-compose up -d`

<br>

Two new containers should magically appear in your Docker, under one "*project*" (or *package*) called `frontend-and-database`:
- `frontend-1` running on 3010, serving the frontend; after a few seconds, the frontend will be available on localhost:3010
- `database-1` running on 5432, serving the database; the database (called 'saltmerch') should already contain the needed tables, as well as some relevant data.