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

/** Book skull */
object FA_BOOK_SKULL: Icon {
	
	override val name get() = "Book skull"
	
	override val unicode get() = "f6b7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M272 144C280.8 144 288 136.8 288 128s-7.25-16-16-16S256 119.3 256 128S263.3 144 272 144zM448 336v-288C448 21.49 426.5 0 400 0H96C42.98 0 0 42.98 0 96v320c0 53.02 42.98 96 96 96h320c17.67 0 32-14.33 32-31.1c0-11.72-6.607-21.52-16-27.1v-81.36C441.8 362.8 448 350.2 448 336zM240 64C284.3 64 320 92.75 320 128c0 20.88-12.75 39.25-32 50.88V192c0 8.75-7.25 16-16 16h-64C199.3 208 192 200.8 192 192V178.9C172.8 167.3 160 148.9 160 128C160 92.75 195.8 64 240 64zM121.7 238.7c-8.125-3.484-11.91-12.89-8.438-21.02c3.469-8.094 12.94-11.86 21-8.422L240 254.5l105.7-45.21c8.031-3.438 17.53 .3281 21 8.422c3.469 8.125-.3125 17.53-8.438 21.02l-77.58 33.18l77.58 33.18c8.125 3.484 11.91 12.89 8.438 21.02C364.1 332.2 358.2 335.8 352 335.8c-2.094 0-4.25-.4062-6.281-1.281L240 289.3l-105.7 45.21C132.3 335.4 130.1 335.8 128 335.8c-6.219 0-12.12-3.641-14.72-9.703C109.8 317.1 113.6 308.6 121.7 305.1l77.58-33.18L121.7 238.7zM384 448H96c-17.67 0-32-14.33-32-32c0-17.67 14.33-32 32-32h288V448zM208 144C216.8 144 224 136.8 224 128S216.8 112 208 112S192 119.3 192 128S199.3 144 208 144z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_BOOK_SKULL]. */
val FA_BOOK_DEAD = FA_BOOK_SKULL
