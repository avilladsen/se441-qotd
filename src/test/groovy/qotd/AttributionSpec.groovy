package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Attribution)
class AttributionSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test for empty attribution name"() {
    	when: 'name is empty'
    	def p = new Attribution(name: '')

    	then: 'validation should fail'
    	!p.validate();
    }

    def "test for null attribution name"() {
    	when: 'name is null'
    	def p = new Attribution(name: null)

    	then: 'validation should fail'
    	!p.validate();
    }

    def "test for legal attribution name"() {
    	when: 'name is legal'
    	def p = new Attribution(name: 'asdf')

    	then: 'validation should pass'
    	p.validate();
    }
}
