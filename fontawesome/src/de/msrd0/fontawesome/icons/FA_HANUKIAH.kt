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

object FA_HANUKIAH: Icon {
	
	override val name get() = "Hanukiah"
	
	override val unicode get() = "f6e6"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M231.1 159.9C227.6 159.9 224 163.6 224 168V288h32V168C256 163.6 252.4 160 248 160L231.1 159.9zM167.1 159.9C163.6 159.9 160 163.6 160 168V288h32V168C192 163.6 188.4 160 184 160L167.1 159.9zM392 160C387.6 160 384 163.6 384 168V288h32V168c0-4.375-3.625-8.061-8-8.061L392 160zM456 160C451.6 160 448 163.6 448 168V288h32V168c0-4.375-3.625-8.061-8-8.061L456 160zM544 168c0-4.375-3.625-8.061-8-8.061L520 160C515.6 160 512 163.6 512 168V288h32V168zM103.1 159.9C99.62 159.9 96 163.6 96 168V288h32V168C128 163.6 124.4 160 120 160L103.1 159.9zM624 160h-31.98c-8.837 0-16.03 7.182-16.03 16.02L576 288c0 17.6-14.4 32-32 32h-192V128c0-8.837-7.151-16.01-15.99-16.01H303.1C295.2 111.1 288 119.2 288 128v192H96c-17.6 0-32-14.4-32-32l.0065-112C64.01 167.2 56.85 160 48.02 160H16C7.163 160 0 167.2 0 176V288c0 53.02 42.98 96 96 96h192v64H175.1C149.5 448 128 469.5 128 495.1C128 504.8 135.2 512 143.1 512h352C504.9 512 512 504.9 512 496C512 469.5 490.5 448 464 448H352v-64h192c53.02 0 96-42.98 96-96V176C640 167.2 632.8 160 624 160zM607.1 127.9C621.2 127.9 632 116 632 101.4C632 86.62 608 48 608 48s-24 38.62-24 53.38C584 116 594.7 127.9 607.1 127.9zM31.1 127.9C45.25 127.9 56 116 56 101.4C56 86.62 32 48 32 48S8 86.62 8 101.4C8 116 18.75 127.9 31.1 127.9zM319.1 79.94c13.25 0 24-11.94 24-26.57C344 38.62 320 0 320 0S296 38.62 296 53.38C296 67.1 306.7 79.94 319.1 79.94zM112 128c13.25 0 24-12 24-26.62C136 86.62 112 48 112 48S88 86.62 88 101.4C88 115.1 98.75 128 112 128zM176 128c13.25 0 24-12 24-26.62C200 86.62 176 48 176 48S152 86.62 152 101.4C152 115.1 162.8 128 176 128zM240 128c13.25 0 24-12 24-26.62C264 86.62 240 48 240 48S216 86.62 216 101.4C216 115.1 226.8 128 240 128zM400 128c13.25 0 24-12 24-26.62C424 86.62 400 48 400 48s-24 38.62-24 53.38C376 115.1 386.8 128 400 128zM464 128c13.25 0 24-12 24-26.62C488 86.62 464 48 464 48s-24 38.62-24 53.38C440 115.1 450.8 128 464 128zM528 128c13.25 0 24-12 24-26.62C552 86.62 528 48 528 48s-24 38.62-24 53.38C504 115.1 514.8 128 528 128z"/></svg>"""
		else -> null
	}
	
}
