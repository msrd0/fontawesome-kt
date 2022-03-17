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

/** Kip Sign */
object FA_KIP_SIGN: Icon {
	
	override val name get() = "Kip Sign"
	
	override val unicode get() = "e1c4"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M182.5 224H352C369.7 224 384 238.3 384 256C384 273.7 369.7 288 352 288H182.5L340.8 423.7C354.2 435.2 355.8 455.4 344.3 468.8C332.8 482.2 312.6 483.8 299.2 472.3L128 325.6V448C128 465.7 113.7 480 96 480C78.33 480 64 465.7 64 448V288H32C14.33 288 0 273.7 0 256C0 238.3 14.33 224 32 224H64V64C64 46.33 78.33 32 96 32C113.7 32 128 46.33 128 64V186.4L299.2 39.7C312.6 28.2 332.8 29.76 344.3 43.18C355.8 56.59 354.2 76.8 340.8 88.3L182.5 224z"/></svg>"""
		else -> null
	}
	
}
