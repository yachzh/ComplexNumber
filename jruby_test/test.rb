# frozen_string_literal: true

require 'java'
require '../target/ComplexNumber-1.0.0.jar'

java_import 'zr.yach.ComplexNumber'

c1 = ComplexNumber.new(3.0, 4.0)
c2 = ComplexNumber.new(2.0, 5.0)
result = c1.add(c2)
puts "Result of addition: #{result}"
abs = result.abs
puts "Absolute value: #{abs}"
