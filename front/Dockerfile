FROM node:14.13.0-alpine

# create destination directory
WORKDIR /front

# update and install dependency
RUN apk update && apk upgrade
RUN apk add git
RUN apk add bash

# copy the app, note .dockerignore
COPY . /front/
RUN yarn install

# build necessary, even if no static files are needed,
# since it builds the server as well
RUN yarn build

# set app serving to permissive / assigned
ENV HOST 0.0.0.0
# set app port
EXPOSE 3000

# default : dev-api-server
ENV BASE_URL=http://54.180.89.13:8080/

# start the app
CMD yarn prod
