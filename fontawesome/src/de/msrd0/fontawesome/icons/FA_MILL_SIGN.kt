/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_MILL_SIGN: Icon {
	
	override val name get() = "Mill Sign"
	
	override val unicode get() = "e1ed"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M282.9 96.53C339.7 102 384 149.8 384 208V416C384 433.7 369.7 448 352 448C334.3 448 320 433.7 320 416V208C320 181.5 298.5 160 272 160C267.7 160 263.6 160.6 259.7 161.6L224 261.5V416C224 433.7 209.7 448 192 448C179.6 448 168.9 440.1 163.6 430.7L142.1 490.8C136.2 507.4 117.9 516.1 101.2 510.1C84.59 504.2 75.92 485.9 81.86 469.2L160 250.5V208C160 181.5 138.5 160 112 160C85.49 160 64 181.5 64 208V416C64 433.7 49.67 448 32 448C14.33 448 0 433.7 0 416V128C0 110.3 14.33 96 32 96C42.87 96 52.48 101.4 58.26 109.7C74.21 100.1 92.53 96 112 96C143.3 96 171.7 108.9 192 129.6C196.9 124.6 202.2 120.1 207.1 116.1L241.9 21.24C247.8 4.595 266.1-4.079 282.8 1.865C299.4 7.809 308.1 26.12 302.1 42.76L282.9 96.53z"/></svg>"""
		else -> null
	}
	
}
