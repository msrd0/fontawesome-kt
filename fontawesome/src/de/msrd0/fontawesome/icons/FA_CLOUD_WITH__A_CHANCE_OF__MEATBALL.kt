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

object FA_CLOUD_WITH__A_CHANCE_OF__MEATBALL: Icon {
	
	override val name get() = "Cloud with (a chance of) Meatball"
	
	override val unicode get() = "f73b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M80 352C53.5 352 32 373.5 32 400S53.5 448 80 448S128 426.5 128 400S106.5 352 80 352zM496 352c-26.5 0-48 21.5-48 48s21.5 48 48 48s48-21.5 48-48S522.5 352 496 352zM377 363.1c4.625-14.5 1.625-30.88-9.75-42.37c-11.5-11.5-27.87-14.38-42.37-9.875c-7-13.5-20.63-23-36.88-23s-29.88 9.5-36.88 23C236.6 306.2 220.2 309.2 208.8 320.8c-11.5 11.5-14.38 27.87-9.875 42.37c-13.5 7-23 20.63-23 36.88s9.5 29.88 23 36.88c-4.625 14.5-1.625 30.88 9.875 42.37c8.25 8.125 19 12.25 29.75 12.25c4.25 0 8.5-1.125 12.62-2.5C258.1 502.5 271.8 512 288 512s29.88-9.5 36.88-23c4.125 1.25 8.375 2.5 12.62 2.5c10.75 0 21.5-4.125 29.75-12.25c11.5-11.5 14.38-27.87 9.75-42.37C390.5 429.9 400 416.2 400 400S390.5 370.1 377 363.1zM544 224c0-53-43-96-96-96c-.625 0-1.125 .25-1.625 .25C447.5 123 448 117.6 448 112C448 67.75 412.2 32 368 32c-24.62 0-46.25 11.25-61 28.75C288.4 24.75 251.2 0 208 0C146.1 0 96 50.12 96 112c0 7.25 .75 14.25 2.125 21.25C59.75 145.8 32 181.5 32 224c0 53 43 96 96 96h43.38C175 312 179.8 304.6 186.2 298.2C199.8 284.8 217.8 277.1 237 276.9C250.5 263.8 268.8 256 288 256s37.5 7.75 51 20.88c19.25 .25 37.25 7.875 50.75 21.37C396.2 304.6 401.1 312 404.6 320H448C501 320 544 277 544 224z"/></svg>"""
		else -> null
	}
	
}
