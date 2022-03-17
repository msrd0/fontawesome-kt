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

object FA_MOSQUE: Icon {
	
	override val name get() = "Mosque"
	
	override val unicode get() = "f678"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M400 0C405 0 409.8 2.371 412.8 6.4C447.5 52.7 490.9 81.34 546.3 117.9C551.5 121.4 556.9 124.9 562.3 128.5C591.3 147.7 608 180.2 608 214.6C608 243.1 596.7 269 578.2 288H221.8C203.3 269 192 243.1 192 214.6C192 180.2 208.7 147.7 237.7 128.5C243.1 124.9 248.5 121.4 253.7 117.9C309.1 81.34 352.5 52.7 387.2 6.4C390.2 2.371 394.1 0 400 0V0zM288 440C288 426.7 277.3 416 264 416C250.7 416 240 426.7 240 440V512H192C174.3 512 160 497.7 160 480V352C160 334.3 174.3 320 192 320H608C625.7 320 640 334.3 640 352V480C640 497.7 625.7 512 608 512H560V440C560 426.7 549.3 416 536 416C522.7 416 512 426.7 512 440V512H448V453.1C448 434.1 439.6 416.1 424.1 404.8L400 384L375 404.8C360.4 416.1 352 434.1 352 453.1V512H288V440zM70.4 5.2C76.09 .9334 83.91 .9334 89.6 5.2L105.6 17.2C139.8 42.88 160 83.19 160 126V128H0V126C0 83.19 20.15 42.88 54.4 17.2L70.4 5.2zM0 160H160V296.6C140.9 307.6 128 328.3 128 352V480C128 489.6 130.1 498.6 133.8 506.8C127.3 510.1 119.9 512 112 512H48C21.49 512 0 490.5 0 464V160z"/></svg>"""
		else -> null
	}
	
}
