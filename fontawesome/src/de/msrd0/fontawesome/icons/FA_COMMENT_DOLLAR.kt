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

object FA_COMMENT_DOLLAR: Icon {
	
	override val name get() = "Comment Dollar"
	
	override val unicode get() = "f651"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 31.1c-141.4 0-255.1 93.09-255.1 208c0 49.59 21.37 94.1 56.97 130.7c-12.5 50.39-54.31 95.3-54.81 95.8C0 468.8-.5938 472.2 .6875 475.2C1.1 478.2 4.813 479.1 8 479.1c66.31 0 116-31.8 140.6-51.41c32.72 12.31 69.02 19.41 107.4 19.41c141.4 0 255.1-93.09 255.1-207.1S397.4 31.1 256 31.1zM317.8 282.3c-3.623 20.91-19.47 34.64-41.83 39.43V332c0 11.03-8.946 20-19.99 20S236 343 236 332v-10.77c-8.682-1.922-17.3-4.723-25.06-7.512l-4.266-1.5C196.3 308.5 190.8 297.1 194.5 286.7c3.688-10.41 15.11-15.81 25.52-12.22l4.469 1.625c7.844 2.812 16.72 6 23.66 7.031c13.72 2.125 28.94 .1875 30.31-7.625c.875-5.094 1.359-7.906-27.92-16.28L244.7 257.5c-17.33-5.094-57.92-17-50.52-59.84C197.8 176.8 213.6 162.8 236 157.1V148c0-11.03 8.961-20 20.01-20s19.99 8.969 19.99 20v10.63c5.453 1.195 11.34 2.789 18.56 5.273c10.44 3.625 15.95 15.03 12.33 25.47c-3.625 10.41-15.06 15.94-25.45 12.34c-5.859-2.031-12-4-17.59-4.844C250.2 194.8 234.1 196.7 233.6 204.5C232.8 208.1 232.3 212.2 255.1 219.2l5.547 1.594C283.8 227.1 325.3 239 317.8 282.3z"/></svg>"""
		else -> null
	}
	
}
