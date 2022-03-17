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

/** Lari Sign */
object FA_LARI_SIGN: Icon {
	
	override val name get() = "Lari Sign"
	
	override val unicode get() = "e1c8"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M144 32C161.7 32 176 46.33 176 64V96.66C181.3 96.22 186.6 96 192 96C197.4 96 202.7 96.22 208 96.66V64C208 46.33 222.3 32 240 32C257.7 32 272 46.33 272 64V113.4C326.9 138.6 367.8 188.9 380.2 249.6C383.7 266.1 372.5 283.8 355.2 287.4C337.8 290.9 320.1 279.7 317.4 262.4C311.4 232.5 294.9 206.4 272 188.1V256C272 273.7 257.7 288 240 288C222.3 288 208 273.7 208 256V160.1C202.8 160.3 197.4 160 192 160C186.6 160 181.2 160.3 176 160.1V256C176 273.7 161.7 288 144 288C126.3 288 112 273.7 112 256V188.1C82.74 211.5 64 247.6 64 288C64 358.7 121.3 416 192 416H352C369.7 416 384 430.3 384 448C384 465.7 369.7 480 352 480H32C14.33 480 0 465.7 0 448C0 430.3 14.33 416 32 416H48.89C18.49 382 0 337.2 0 288C0 210.5 45.9 143.7 112 113.4V64C112 46.33 126.3 32 144 32V32z"/></svg>"""
		else -> null
	}
	
}
