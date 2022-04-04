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

/** Q */
object FA_Q: Icon {
	
	override val name get() = "Q"
	
	override val unicode get() = "51"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M393.1 402.5c34.12-39.32 54.93-90.48 54.93-146.5c0-123.5-100.5-224-223.1-224S.0001 132.5 .0001 256s100.5 224 223.1 224c44.45 0 85.81-13.16 120.7-35.58l46.73 56.08c6.328 7.594 15.42 11.52 24.59 11.52c21.35 0 31.98-18.26 31.98-32.01c0-7.223-2.433-14.49-7.419-20.47L393.1 402.5zM224 416c-88.22 0-160-71.78-160-160s71.78-159.1 160-159.1s160 71.78 160 159.1c0 36.21-12.55 69.28-32.92 96.12L280.6 267.5c-6.338-7.597-15.44-11.53-24.61-11.53c-21.27 0-31.96 18.22-31.96 32.02c0 7.223 2.433 14.49 7.419 20.47l71.53 85.83C279.6 407.7 252.8 416 224 416z"/></svg>"""
		else -> null
	}
	
}