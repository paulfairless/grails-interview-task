package grails.interview.task

class Comment {
    String commentText
	Date dateCreated

    static belongsTo = [ article: Article ]

    static constraints = {
    }
}
