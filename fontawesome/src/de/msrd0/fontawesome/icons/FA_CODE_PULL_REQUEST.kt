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

/** Code Pull Request */
object FA_CODE_PULL_REQUEST: Icon {
	
	override val name get() = "Code Pull Request"
	
	override val unicode get() = "e13c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M305.8 2.076C314.4 5.932 320 14.52 320 24V64H336C406.7 64 464 121.3 464 192V358.7C492.3 371 512 399.2 512 432C512 476.2 476.2 512 432 512C387.8 512 352 476.2 352 432C352 399.2 371.7 371 400 358.7V192C400 156.7 371.3 128 336 128H320V168C320 177.5 314.4 186.1 305.8 189.9C297.1 193.8 286.1 192.2 279.9 185.8L199.9 113.8C194.9 109.3 192 102.8 192 96C192 89.2 194.9 82.71 199.9 78.16L279.9 6.161C286.1-.1791 297.1-1.779 305.8 2.077V2.076zM432 456C445.3 456 456 445.3 456 432C456 418.7 445.3 408 432 408C418.7 408 408 418.7 408 432C408 445.3 418.7 456 432 456zM112 358.7C140.3 371 160 399.2 160 432C160 476.2 124.2 512 80 512C35.82 512 0 476.2 0 432C0 399.2 19.75 371 48 358.7V153.3C19.75 140.1 0 112.8 0 80C0 35.82 35.82 .0004 80 .0004C124.2 .0004 160 35.82 160 80C160 112.8 140.3 140.1 112 153.3V358.7zM80 56C66.75 56 56 66.75 56 80C56 93.25 66.75 104 80 104C93.25 104 104 93.25 104 80C104 66.75 93.25 56 80 56zM80 408C66.75 408 56 418.7 56 432C56 445.3 66.75 456 80 456C93.25 456 104 445.3 104 432C104 418.7 93.25 408 80 408z"/></svg>"""
		else -> null
	}
	
}
