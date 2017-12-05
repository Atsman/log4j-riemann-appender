shell := bash

deploy:
	GPG_TTY=$(tty) lein deploy clojars
