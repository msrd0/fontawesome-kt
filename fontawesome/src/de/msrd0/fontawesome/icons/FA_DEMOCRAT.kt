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

/** Democrat */
object FA_DEMOCRAT: Icon {
	
	override val name get() = "Democrat"
	
	override val unicode get() = "f747"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M191.1 479.1C191.1 497.6 206.4 512 223.1 512h32c17.6 0 32-14.4 32-32v-64h160v64c0 17.6 14.41 32 32.01 32L511.1 512c17.6 0 32-14.4 32-32l.0102-128H192L191.1 479.1zM637.2 256.9l-19.5-29.38c-28.25-42.25-75.38-67.5-126.1-67.5H255.1L174.7 78.75c20.13-20 22.63-51 7.5-73.88C178.9-.2552 171.5-1.005 167.1 3.37L125.2 45.25L82.36 2.37C78.74-1.255 72.74-.6302 69.99 3.62c-12.25 18.63-10.25 44 6.125 60.38c3.25 3.25 7.25 5.25 11.25 7.5c-2.125 1.75-4.625 3.125-6.375 5.375l-74.63 99.38C-.8895 185.9-2.014 198.9 3.361 209.7l14.38 28.5c5.375 10.88 16.5 17.75 28.5 17.75H77.24c8.5 0 16.63-3.375 22.63-9.375l38.13-34.63l54.04 108h351.1l-.0102-77.75c16.25 12.13 18.25 17.5 40.13 50.25c4.875 7.375 14.75 9.25 22.13 4.375l26.63-17.63C640.2 274.2 642.2 264.2 637.2 256.9zM296.2 243.2L279.7 259.4l3.875 22.75c.625 4.125-3.625 7.125-7.25 5.25L255.1 276.7L235.6 287.4C231.1 289.2 227.7 286.2 228.4 282.1l3.875-22.75L215.7 243.2c-3-2.875-1.25-7.875 2.875-8.5l22.75-3.25l10.25-20.75c1.75-3.625 7.125-3.625 9 0l10.13 20.75l22.88 3.25C297.6 235.4 299.2 240.4 296.2 243.2zM408.2 243.2l-16.5 16.13l3.875 22.75c.625 4.125-3.625 7.125-7.25 5.25L367.1 276.7l-20.38 10.63c-3.625 1.875-7.875-1.125-7.25-5.25l3.875-22.75l-16.5-16.13c-3-2.875-1.25-7.875 2.875-8.5l22.75-3.25l10.25-20.75c1.75-3.625 7.125-3.625 9 0l10.13 20.75l22.88 3.25C409.6 235.4 411.2 240.4 408.2 243.2zM520.2 243.2l-16.5 16.13l3.875 22.75c.625 4.125-3.625 7.125-7.25 5.25l-20.38-10.63l-20.38 10.63c-3.625 1.875-7.875-1.125-7.25-5.25l3.875-22.75l-16.5-16.13c-3-2.875-1.25-7.875 2.875-8.5l22.75-3.25l10.25-20.75c1.75-3.625 7.125-3.625 9 0l10.13 20.75l22.88 3.25C521.6 235.4 523.2 240.4 520.2 243.2z"/></svg>"""
		else -> null
	}
	
}
