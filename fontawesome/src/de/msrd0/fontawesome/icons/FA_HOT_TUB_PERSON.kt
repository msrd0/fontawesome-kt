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

object FA_HOT_TUB_PERSON: Icon {
	
	override val name get() = "Hot tub person"
	
	override val unicode get() = "f593"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M414.3 177.6C415.3 185.9 421.1 192 429.1 192h16.13c9.5 0 17-8.625 16-18.38C457.8 134.5 439.6 99.12 412 76.5c-17.38-14.12-28.88-36.75-32-62.12C379 6.125 372.3 0 364.3 0h-16.12c-9.5 0-17.12 8.625-16 18.38c4.375 39.12 22.38 74.5 50.13 97.13C399.6 129.6 411 152.2 414.3 177.6zM306.3 177.6C307.3 185.9 313.1 192 321.1 192h16.13c9.5 0 17-8.625 16-18.38C349.8 134.5 331.6 99.12 304 76.5c-17.38-14.12-28.88-36.75-32-62.12C271 6.125 264.3 0 256.3 0h-16.17C230.6 0 223 8.625 224.1 18.38C228.5 57.5 246.5 92.88 274.3 115.5C291.6 129.6 303 152.2 306.3 177.6zM480 256h-224L145.1 172.8C133.1 164.5 120.5 160 106.6 160H64C28.62 160 0 188.6 0 224v224c0 35.38 28.62 64 64 64h384c35.38 0 64-28.62 64-64V288C512 270.4 497.6 256 480 256zM128 440C128 444.4 124.4 448 120 448h-16C99.62 448 96 444.4 96 440v-112C96 323.6 99.62 320 104 320h16C124.4 320 128 323.6 128 328V440zM224 440C224 444.4 220.4 448 216 448h-16C195.6 448 192 444.4 192 440v-112C192 323.6 195.6 320 200 320h16C220.4 320 224 323.6 224 328V440zM320 440c0 4.375-3.625 8-8 8h-16C291.6 448 288 444.4 288 440v-112c0-4.375 3.625-8 8-8h16c4.375 0 8 3.625 8 8V440zM416 440c0 4.375-3.625 8-8 8h-16C387.6 448 384 444.4 384 440v-112c0-4.375 3.625-8 8-8h16c4.375 0 8 3.625 8 8V440zM64 128c35.38 0 64-28.62 64-64S99.38 0 64 0S0 28.62 0 64S28.62 128 64 128z"/></svg>"""
		else -> null
	}
	
}

val FA_HOT_TUB = FA_HOT_TUB_PERSON
