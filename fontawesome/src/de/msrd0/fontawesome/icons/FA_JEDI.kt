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

/** Jedi */
object FA_JEDI: Icon {
	
	override val name get() = "Jedi"
	
	override val unicode get() = "f669"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M554.9 293.1l-58.88 58.88h40C493.2 446.1 398.2 511.1 287.1 512c-110.3-.0078-205.2-65.88-247.1-160h40L21.13 293.1C17.75 275.1 16 258.6 16 241.2c0-5.75 .75-11.5 1-17.25h47L22.75 182.7C37.38 117.1 75.86 59.37 130.6 20.5c2.75-2 6.021-3.005 9.272-3.005c5.5 0 10.5 2.75 13.5 7.25c3.125 4.375 3.625 10.13 1.625 15.13C148.5 56.12 145.1 73.62 145.1 91.12c0 45.13 21.13 86.63 57.75 113.8C206.9 207.7 209.4 212.4 209.5 217.2c.25 5-1.751 9.752-5.501 13c-32.75 29.38-47.5 74-38.5 117.1c9.751 48.38 48.88 87.13 97.26 96.5l2.5-65.37l-27.13 18.5c-3.125 2-7.251 1.75-10-.75c-2.75-2.625-3.25-6.75-1.375-10l20.13-33.75l-42.13-8.627c-3.625-.875-6.375-4.125-6.375-7.875s2.75-7 6.375-7.875l42.13-8.75L226.8 285.6C224.9 282.5 225.4 278.4 228.1 275.7c2.75-2.5 6.876-2.875 10-.75l30.38 20.63l11.49-287.8C280.3 3.461 283.7 .0156 287.1 0c4.237 .0156 7.759 3.461 8.009 7.828l11.49 287.8l30.38-20.63c3.125-2.125 7.251-1.75 10 .75c2.75 2.625 3.25 6.75 1.375 9.875l-20.13 33.75l42.13 8.75c3.625 .875 6.375 4.125 6.375 7.875s-2.75 7-6.375 7.875l-42.13 8.627l20.13 33.75c1.875 3.25 1.375 7.375-1.375 10c-2.75 2.5-6.876 2.75-10 .75l-27.13-18.5l2.5 65.37c48.38-9.375 87.51-48.13 97.26-96.5c9.001-43.13-5.75-87.75-38.5-117.1c-3.75-3.25-5.751-8.002-5.501-13c.125-4.875 2.626-9.5 6.626-12.38c36.63-27.13 57.75-68.63 57.75-113.8c0-17.5-3.375-35-9.875-51.25c-2-5-1.5-10.75 1.625-15.13c3-4.5 8.001-7.25 13.5-7.25c3.25 0 6.474 .9546 9.224 2.955c54.75 38.88 93.28 96.67 107.9 162.3l-41.25 41.25h47c.2501 5.75 .9965 11.5 .9965 17.25C559.1 258.6 558.3 275.1 554.9 293.1z"/></svg>"""
		else -> null
	}
	
}
