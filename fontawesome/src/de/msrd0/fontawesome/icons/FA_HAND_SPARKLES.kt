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

/** Hand Sparkles */
object FA_HAND_SPARKLES: Icon {
	
	override val name get() = "Hand Sparkles"
	
	override val unicode get() = "e05d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M448 432c0-14.25 8.547-28.14 21.28-34.55l39.56-16.56l15.64-37.52c4.461-9.037 11.45-15.37 19.43-19.23L544 128c0-17.67-14.33-32-32-32s-32 14.33-32 32l-.0156 112c0 8.836-7.148 16-15.98 16s-16.07-7.164-16.07-16L448 64c0-17.67-14.33-32-32-32s-32 14.33-32 32l-.0635 176c0 8.836-7.106 16-15.94 16S351.9 248.8 351.9 240L352 32c0-17.67-14.33-32-32-32S288 14.33 288 32L287.9 240C287.9 248.8 280.8 256 272 256S255.9 248.8 255.9 240L256 64c0-17.67-14.33-32-32-32S192 46.33 192 64v279.4L132.3 283.7C124.5 275.9 114.2 272 104 272C82.68 272 64 289.2 64 312c0 10.23 3.906 20.47 11.72 28.28l113.1 113.1C226.6 491.2 276.9 512 330.3 512H368c42.72 0 81.91-15.32 112.4-40.73l-9.049-3.773C456.6 460.1 448 446.3 448 432zM349.8 371.6L320 383.1l-12.42 29.78C306.1 415 305.4 416 304 416s-2.969-.9941-3.578-2.219L288 383.1l-29.79-12.42C256.1 370.1 256 369.4 256 367.1c0-1.365 .9922-2.967 2.209-3.577L288 352l12.42-29.79C301 320.1 302.6 320 304 320s2.967 .9902 3.578 2.217L320 352l29.79 12.42C351 365 352 366.6 352 367.1C352 369.4 351 370.1 349.8 371.6zM80 224c2.277 0 4.943-1.656 5.959-3.699l20.7-49.63l49.65-20.71c2.027-1.014 3.682-3.696 3.686-5.958C159.1 141.7 158.3 139.1 156.3 138L106.7 117.4L85.96 67.7C84.94 65.65 82.28 64 80 64C77.72 64 75.05 65.65 74.04 67.7L53.34 117.3L3.695 138C1.668 139.1 .0117 141.7 .0078 143.1c.0039 2.262 1.662 4.953 3.688 5.967l49.57 20.67l20.77 49.67C75.05 222.3 77.72 224 80 224zM639.1 432c-.0039-2.275-1.657-4.952-3.687-5.968l-49.57-20.67l-20.77-49.67C564.9 353.7 562.3 352 560 352c-2.281 0-4.959 1.652-5.975 3.695l-20.7 49.63l-49.64 20.71c-2.027 1.016-3.682 3.683-3.686 5.958c.0039 2.262 1.661 4.954 3.686 5.968l49.57 20.67l20.77 49.67C555.1 510.3 557.7 512 560 512c2.277 0 4.933-1.656 5.949-3.699l20.7-49.63l49.65-20.71C638.3 436.9 639.1 434.3 639.1 432z"/></svg>"""
		else -> null
	}
	
}
