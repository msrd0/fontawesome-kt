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

/** Book quran */
object FA_BOOK_QURAN: Icon {
	
	override val name get() = "Book quran"
	
	override val unicode get() = "f687"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M352 0H48C21.49 0 0 21.49 0 48v288c0 14.16 6.246 26.76 16 35.54v81.36C6.607 458.5 0 468.3 0 479.1C0 497.7 14.33 512 31.1 512h320c53.02 0 96-42.98 96-96V96C448 42.98 405 0 352 0zM324.8 170.4c3.006 .4297 4.295 4.154 2.004 6.301L306.2 196.9l4.869 28.5c.4297 2.434-1.576 4.439-3.725 4.439c-.5723 0-1.145-.1445-1.719-.4297L280 215.9l-25.63 13.46c-.5723 .2852-1.145 .4297-1.719 .4297c-2.146 0-4.152-2.006-3.723-4.439l4.869-28.5l-20.62-20.19c-2.291-2.146-1.002-5.871 2.006-6.301l28.64-4.152l12.89-25.92C277.3 138.9 278.7 138.2 280 138.2s2.721 .7168 3.295 2.148l12.89 25.92L324.8 170.4zM216 72c23.66 0 46.61 6.953 66.36 20.09c3.219 2.141 4.438 6.281 2.906 9.844c-1.547 3.547-5.453 5.562-9.172 4.594C268.8 104.8 262.2 104 256 104C207.5 104 168 143.5 168 192S207.5 280 256 280c6.234 0 12.81-.8281 20.09-2.531c3.719-.9687 7.625 1.047 9.172 4.594c1.531 3.562 .3125 7.703-2.906 9.844C262.6 305 239.7 312 216 312C149.8 312 96 258.2 96 192S149.8 72 216 72zM352 448H64v-64h288c17.67 0 32 14.33 32 32C384 433.7 369.7 448 352 448z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_BOOK_QURAN]. */
val FA_QURAN = FA_BOOK_QURAN
